package winapp.daggerwithretro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;
import winapp.daggerwithretro.api.PostService;
import winapp.daggerwithretro.model.Post;

public class MainActivity extends AppCompatActivity {
    @Inject
    PostService postService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApp) getApplication()).getAppComponent().inject(this);


        postService.GetPost().enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                Timber.d("Got some books back!" + response.body().getTitle());

            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Timber.d("Failed to get!");

            }
        });

    }
}
