package com.bilalkarademir.stanbulharikalar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class menuActivity extends AppCompatActivity {

    Context context = this;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        ArrayList<String> menuItem = new ArrayList<>();
        menuItem.add("AnaSayfam");
        menuItem.add("Profilim");
        menuItem.add("Hakkımızda");

        for(String item : menuItem){
            MenuItem menuItem1 = menu.add(item);
            menuItem1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {

                   if(item.getTitle().equals("AnaSayfam")){

                       Intent intent = new Intent(context,MainActivity.class);
                       startActivity(intent);
                       return true;
                   }
                   if(item.getTitle().equals("Hakkımızda")){

                       Intent intent = new Intent(context,Hakkimizda_Activity.class);
                       startActivity(intent);

                       return true;
                   }
                    if(item.getTitle().equals("Profilim")){

                        Intent intent = new Intent(context,Profil_Activity.class);
                        startActivity(intent);

                        return true;
                    }
                    return true;
                }
            });
        }

        return super.onCreateOptionsMenu(menu);
    }


}
