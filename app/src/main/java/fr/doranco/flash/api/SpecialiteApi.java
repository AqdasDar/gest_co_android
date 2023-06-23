package fr.doranco.flash.api;

import java.util.List;

import fr.doranco.flash.entity.Specialite;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Definition de la requete a envoyer au serveur
 */
public interface SpecialiteApi {
    @GET("v3/a2ce3ef5-4b25-42a2-bc32-1771918bd34c")
    Call<List<Specialite>> getSpecialites();
}
