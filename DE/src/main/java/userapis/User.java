package userapis;

import java.sql.Date;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User{
    public String country;
    public Role role;
    public CustomizeInfo customize_info;
    public Object city;
    public Object signature;
    @JsonProperty("Current_Shift") 
    public Object current_Shift;
    public String name_format;
    public String language;
    public boolean microsoft;
    public String locale;
    public boolean personal_account;
    @JsonProperty("Isonline") 
    public boolean isonline;
    public String default_tab_group;
    @JsonProperty("Modified_By") 
    public ModifiedBy modified_By;
    public Object street;
    public Object alias;
    public Theme theme;
    public String id;
    public String state;
    public Object fax;
    public String country_locale;
    public boolean sandboxDeveloper;
    public String first_name;
    public String email;
    @JsonProperty("Reporting_To") 
    public Object reporting_To;
    public Object zip;
    public String decimal_separator;
    public Date created_time;
    public Object website;
    @JsonProperty("Modified_Time") 
    public Date modified_Time;
    public String time_format;
    public int offset;
    public Profile profile;
    public Object mobile;
    @JsonProperty("Next_Shift") 
    public Object next_Shift;
    public String last_name;
    public String time_zone;
    public CreatedBy created_by;
    @JsonProperty("Shift_Effective_From") 
    public Object shift_Effective_From;
    public String zuid;
    public boolean confirm;
    public String full_name;
    public ArrayList<Object> territories;
    public Object phone;
    public Object dob;
    public String date_format;
    public String status;
}
