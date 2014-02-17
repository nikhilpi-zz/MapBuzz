package com.example.mapbuzz;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

public class JsonParser {

	public static ArrayList<Direction> parseContact(String url){
					// Creating service handler class instance
					ServiceHandler sh = new ServiceHandler();
					ArrayList<Direction> directions = new ArrayList<Direction>();
					
					// Making a request to url and getting response
					String jsonStr = sh.makeServiceCall(url, ServiceHandler.GET);

					Log.d("Response: ", "> " + jsonStr);

					if (jsonStr != null) {
						try {
							JSONObject route = new JSONObject(jsonStr);
							JSONArray steps = route.getJSONArray("steps");
							
							// looping through All Contacts
							for (int i = 0; i < contacts.length(); i++) {
								JSONObject c = contacts.getJSONObject(i);
								Contact contact = new Contact();
								
								contact.setName(c.getString("name"));
								contact.setEmployeeID(c.getInt("employeeId"));
								contact.setCompany(c.getString("company"));
								contact.setDeatilsURL(c.getString("detailsURL"));
								contact.setSmlIMG(c.getString("smallImageURL"));
								contact.setBday(c.getString("birthdate"));
								

								JSONObject phone = c.getJSONObject("phone");
								if(phone.has("mobile")){
									contact.setPhone_mobile(phone.getString("mobile"));
								} else {
									contact.setPhone_mobile("");
								}
								
								if(phone.has("home")){
									contact.setPhone_home(phone.getString("home"));
								} else {
									contact.setPhone_home("");
								}
								
								if(phone.has("work")){
									contact.setPhone_work(phone.getString("work"));
								} else {
									contact.setPhone_work("");
								}
								
								contactList.add(contact);
							}
						} catch (JSONException e) {
							e.printStackTrace();
						}
					} else {
						Log.e("ServiceHandler", "Couldn't get any data from the url");
					}

					return directions;
	}
	
	
}

