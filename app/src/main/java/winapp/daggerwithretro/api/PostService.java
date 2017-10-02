package winapp.daggerwithretro.api;

import retrofit2.Call;
import retrofit2.http.GET;
import winapp.daggerwithretro.model.Post;

/**
 * Created by karthick on 02/10/17.
 */

public interface PostService {
    @GET("/posts/1")
    Call<Post> GetPost();
}
