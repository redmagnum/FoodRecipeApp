package com.example.user.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    List<Model> kereta = new ArrayList();
    MyOwnAdapter ad;

    public void masukan()
    {
        kereta.add(new Model("Pizza","Pizza a yeasted flatbread typically topped with tomato sauce.","\nIngredients:\n" +
                "- 2 Siung bawang bombay.\n- 2 Buah sosis.\n- 2 Buah tomat.\n" +
                "- Daging cincang.\n- 1 Buah paprika.\n- 2 Siung bawang putih.\n- 1 Butir telur ayam.\n" +
                "\nSteps:\n" +
                "1. Ambil adonan roti, masukkan ke dalam teflon, ratakan, lalu tusuk - tusuk  dengan garpu supaya adonan dapat mengembang.\n" +
                "2. Beri saus tomat pada adonan sampai rata. Taburkan topping dan lapisi lagi dengan saus tomat.\n" +
                "3. Kemudian beri parutan keju di bagian atas. Lalu angkat dan Pizza italia rumahan tanpa oven namun tetap enak siap untuk disajikan.", R.drawable.pizza));

        kereta.add(new Model("Hamburger","Hamburger is a sandwich consisting of cooked patties.","\nIngredients:\n" +
                "- 4 Roti hamburger.\n- 400g Daging sapi.\n- 1 Buah tomat.\n" +
                "- Daun selada.\n- 1 Buah paprika.\n- 2 Siung bawang putih.\n- Acar & timun.\n" +
                "\nSteps:\n" +
                "1. Buat terlebih dahulu isi hamburger dengan cara mencampurkan cincangan daging, tepung roti, lada putih dan bawang putih kedalam wadah yang sama sambil diaduk hingga tercampur rata.\n" +
                "2. Bila sudah matang, angkat dan sisihkan. Beri olesan lagi kedalam wajan bekas memasak adonan daging tadi kemudian masukkan roti hamburger dan keju diatasnya dan panggang sebentar saja. Angkat.\n" +
                "3. Tata rapi roti haburger, isi hamburger, daun selada, tomat dan acar mentimun lalu tutup lagi dengan roti. Hidangkan.", R.drawable.hamb));

        kereta.add(new Model("Chicken Nugget","Chicken Nugget is a chicken product made from chicken meat.","\nIngredients:\n" +
                "- 500g Daging ayam tanpa tulang.\n- 400g Daging sapi.\n- 1 Buah tomat.\n" +
                "- Daun selada.\n- 1 Buah paprika.\n- 2 Siung bawang putih.\n- Acar & timun.\n" +
                "\nSteps:\n" +
                "1. Buat terlebih dahulu isi hamburger dengan cara mencampurkan cincangan daging, tepung roti, lada putih dan bawang putih kedalam wadah yang sama sambil diaduk hingga tercampur rata.\n" +
                "2. Bila sudah matang, angkat dan sisihkan. Beri olesan lagi kedalam wajan bekas memasak adonan daging tadi kemudian masukkan roti hamburger dan keju diatasnya dan panggang sebentar saja. Angkat.\n" +
                "3. Tata rapi roti haburger, isi hamburger, daun selada, tomat dan acar mentimun lalu tutup lagi dengan roti. Hidangkan.", R.drawable.chick));

        kereta.add(new Model("Spaghetti","Spaghetti is a long, thin, cylindrical, solid pasta.It is a staple food of traditional Italian\n","\nIngredients:\n" +
                "- 2 Siung bawang bombay.\n- 2 Buah sosis.\n- 1 Buah tomat.\n" +
                "- Daging cincang.\n- 1 Buah paprika.\n- 2 Siung bawang putih.\n- 1 Butir telur ayam.\n" +
                "\nSteps:\n" +
                "1. Ambil adonan roti, masukkan ke dalam teflon, ratakan, lalu tusuk - tusuk  dengan garpu supaya adonan dapat mengembang.\n" +
                "2. Beri saus tomat pada adonan sampai rata. Taburkan topping dan lapisi lagi dengan saus tomat.\n" +
                "3. Kemudian beri parutan keju di bagian atas. Lalu angkat dan Pizza italia rumahan tanpa oven namun tetap enak siap untuk disajikan.", R.drawable.spag));
        kereta.add(new Model("Shawarma","Shawarma is a Levantine meat preparation, where lamb, chicken, turkey, beef, veal, or mixed meats","\nIngredients:\n" +
                "- 2 Siung bawang bombay.\n- 2 Buah sosis.\n- 2 Buah tomat.\n" +
                "- Daging cincang.\n- 1 Buah paprika.\n- 2 Siung bawang putih.\n- 1 Butir telur ayam.\n" +
                "\nSteps:\n" +
                "1. Ambil adonan roti, masukkan ke dalam teflon, ratakan, lalu tusuk - tusuk  dengan garpu supaya adonan dapat mengembang.\n" +
                "2. Beri saus tomat pada adonan sampai rata. Taburkan topping dan lapisi lagi dengan saus tomat.\n" +
                "3. Kemudian beri parutan keju di bagian atas. Lalu angkat dan Pizza italia rumahan tanpa oven namun tetap enak siap untuk disajikan.", R.drawable.shaw));
        ad.notifyDataSetChanged();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RecyclerView) findViewById(R.id.myRecycler);

        ad = new MyOwnAdapter(this, kereta);

        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));

        masukan();
    }
}
