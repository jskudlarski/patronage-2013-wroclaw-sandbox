package com.blstream.urbangame;

import java.util.ArrayList;
import java.util.Arrays;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyGamesActivity extends Activity {

	private ListView TEMPactiveGameList;
	private ListView TEMPobservedGameList;
	private ListView TEMPendedGameList;
	private ArrayAdapter<String> TEMPlistAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_games_layout);
		
		
		//add simple items to lists to check if they work
		TEMPactiveGameList = (ListView) findViewById(R.id.TEMPactive_game_list);
		TEMPobservedGameList = (ListView) findViewById(R.id.TEMPobserved_game_list);
		TEMPendedGameList = (ListView) findViewById(R.id.TEMPended_game_list);
	
		String[] games = new String[] { "Gra1", "Gra2", "Gra3", "Gra4", "Gra5", "Gra6"};  
		ArrayList<String> gamesList = new ArrayList<String>();
		gamesList.addAll( Arrays.asList(games) );

		TEMPlistAdapter = new ArrayAdapter<String>(this, R.layout.temp_game_view, gamesList);

		TEMPactiveGameList.setAdapter( TEMPlistAdapter );
		TEMPobservedGameList.setAdapter(TEMPlistAdapter);
		TEMPendedGameList.setAdapter(TEMPlistAdapter);
				
	}

}
