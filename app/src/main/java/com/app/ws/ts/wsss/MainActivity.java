package com.app.ws.ts.wsss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.app.ws.ts.wsss.Model.Dat;
import com.app.ws.ts.wsss.Model.Endereco;
import com.app.ws.ts.wsss.Model.Usuario;
import com.app.ws.ts.wsss.WS.IServ;
import com.app.ws.ts.wsss.WS.IService;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bnt_git = findViewById(R.id.WS_2);

        Button bnt_zipcod = findViewById(R.id.WS_1);

            bnt_git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    IService iService = IService.retrofit.create(IService.class);
                    final Call<Dat> call = iService.getCep("60832160");  //Complemento da URL
                    call.enqueue(new Callback<Dat>() {
                        @Override
                        public void onResponse(Call<Dat> call, Response<Dat> response) {
                            int code = response.code();
                            if (code == 200) {
                                Dat login = response.body();
                                try {
                                    Mapeamento(login);
                                    Toast.makeText(getBaseContext(), "Nome do usuário: " + login.getData().getAttributes().getCity()  , Toast.LENGTH_LONG).show();
                                } catch (Exception e) {
                                    e.getMessage();
                                }
                            } else {
                                Toast.makeText(getBaseContext(), "Falha: " + String.valueOf(code), Toast.LENGTH_LONG).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<Dat> call, Throwable t) {
                            Toast.makeText(getBaseContext(), t.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            });

        bnt_zipcod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IServ iServic = IServ.retrofit.create(IServ.class);
                final Call<Usuario> call = iServic.getUsuario("ammenendez");  //Complemento da URL
                call.enqueue(new Callback<Usuario>() {
                    @Override
                    public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                        int code = response.code();
                        if (code == 200) {
                            Usuario login = response.body();
                            try {
                                Toast.makeText(getBaseContext(), "Nome do usuário: " + login.getName().toString(), Toast.LENGTH_LONG).show();
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        } else {
                            Toast.makeText(getBaseContext(), "Falha: " + String.valueOf(code), Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Usuario> call, Throwable t) {
                        Toast.makeText(getBaseContext(), t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
            }
        });


    }
    public void Mapeamento(Dat dat){
        Endereco v = new Endereco();
        v.setCity(dat.getData().getAttributes().getCity());
        v.setState(dat.getData().getAttributes().getState());

    }
}


