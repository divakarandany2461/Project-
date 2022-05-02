package Demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConvertMapping{
    @JsonProperty("Contacts") 
    public String contacts;
    @JsonProperty("Deals") 
    public String deals;
    @JsonProperty("Accounts") 
    public String accounts;
    @JsonProperty("Invoices") 
    public String invoices;
    @JsonProperty("Sales_Orders") 
    public String sales_Orders;
}
