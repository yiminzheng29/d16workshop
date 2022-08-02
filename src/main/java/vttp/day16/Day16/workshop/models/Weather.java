package vttp.day16.Day16.workshop.models;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Weather {
      
      private String main;
      private String description;
      private String icon;

      public String getMain() {
            return main;
      }
      public void setMain(String main) {
            this.main = main;
      }
      public String getDescription() {
            return description;
      }
      public void setDescription(String description) {
            this.description = description;
      }
      public String getIcon() {
            return icon;
      }
      public void setIcon(String icon) {
            this.icon = icon;
      }

      // Json to model
      public static Weather create(JsonObject jo) {
            // weather[0]
            Weather w = new Weather();
            w.setMain(jo.getString("main"));
            w.setIcon(jo.getString("icon"));
            w.setDescription(jo.getString("description"));
            return w;
      }

      // model to Json
      public JsonObject toJsonObject() {
            return Json.createObjectBuilder()
                  .add("main", main)
                  .add("description", description)
                  .add("icon", icon)
                  .build();
      }
      
}
