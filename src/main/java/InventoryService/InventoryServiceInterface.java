package InventoryService;
import org.json.JSONArray;



public abstract class InventoryServiceInterface {

        public abstract JSONArray addItems(JSONArray array);
        public abstract JSONArray editItems(JSONArray array, String name);
        public abstract JSONArray removeItems(JSONArray array, String name);
        public abstract void displayItems(JSONArray array);
        public abstract void totalValueOfInventory(JSONArray array);
        public abstract void totalWeightOfInventory(JSONArray array);
        public abstract void totalPriceOfInventory(JSONArray array);

}

