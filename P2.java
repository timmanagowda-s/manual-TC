package sdet_assignments;

import org.json.JSONArray;
import org.json.JSONObject;

public class P2 {
    public static void main(String[] args) {
       
        String jsonData = """
        {
            "page": 1,
            "per_page": 6,
            "total": 12,
            "total_pages": 2,
            "data": [
                {
                    "id": 1,
                    "email": "george.bluth@deloitte.com",
                    "first_name": "George",
                    "last_name": "Bluth",
                    "avatar": "https://reqres.in/img/faces/1-image.jpg"
                },
                {
                    "id": 2,
                    "email": "janet.weaver@example.com",
                    "first_name": "Janet",
                    "last_name": "Weaver",
                    "avatar": "https://reqres.in/img/faces/2-image.jpg"
                },
                {
                    "id": 3,
                    "email": "emma.wong@example.com",
                    "first_name": "Emma",
                    "last_name": "Wong",
                    "avatar": "https://reqres.in/img/faces/3-image.jpg"
                },
                {
                    "id": 4,
                    "email": "eve.holt@deloitte.com",
                    "first_name": "Eve",
                    "last_name": "Holt",
                    "avatar": "https://reqres.in/img/faces/4-image.jpg"
                },
                {
                    "id": 5,
                    "email": "charles.morris@example.com",
                    "first_name": "Charles",
                    "last_name": "Morris",
                    "avatar": "https://reqres.in/img/faces/5-image.jpg"
                },
                {
                    "id": 6,
                    "email": "tracey.ramos@deloitte.com",
                    "first_name": "Tracey",
                    "last_name": "Ramos",
                    "avatar": "https://reqres.in/img/faces/6-image.jpg"
                }
            ],
            "support": {
                "url": "https://reqres.in/#support-heading",
                "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
            }
        }
        """;

       
        JSONObject jsonObject = new JSONObject(jsonData);
        JSONArray dataArray = jsonObject.getJSONArray("data");

       
        for (int i = 0; i < dataArray.length(); i++) {
            JSONObject user = dataArray.getJSONObject(i);
            String email = user.getString("email");

           
            if (email.endsWith("@deloitte.com")) {
                System.out.println("Valid User:");
                System.out.println("ID: " + user.getInt("id"));
                System.out.println("Email: " + email);
                System.out.println("First Name: " + user.getString("first_name"));
                System.out.println("Last Name: " + user.getString("last_name"));
                System.out.println("Avatar: " + user.getString("avatar"));
                System.out.println();
            } else {
                
                user.put("email", "Not a valid e-mail address");

                System.out.println("Invalid User:");
                System.out.println("ID: " + user.getInt("id"));
                System.out.println("Email: " + user.getString("email"));
                System.out.println("First Name: " + user.getString("first_name"));
                System.out.println("Last Name: " + user.getString("last_name"));
                System.out.println("Avatar: " + user.getString("avatar"));
                System.out.println();
            }
        }
    }
}

