package br.com.fiap.filipepinato.notepad.api;

import java.util.List;

import br.com.fiap.filipepinato.notepad.model.Nota;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface NotaAPI {
    @GET(value = "/nota/{titulo}")
    Call<List<Nota>> buscaNota(@Path(value = "titulo")String nota);

    @POST(value = "/nota")
    Call<Void> salvar(@Body Nota nota);
}
