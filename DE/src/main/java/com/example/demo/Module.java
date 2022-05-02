package com.example.demo;

import java.util.ArrayList;

public class Module{
    public boolean global_search_supported;
    public boolean deletable;
    public Object description;
    public boolean creatable;
    public boolean inventory_template_supported;
    public Object modified_time;
    public String plural_label;
    public boolean presence_sub_menu;
    public boolean triggers_supported;
    public String id;
    public boolean isBlueprintSupported;
    public int visibility;
    public boolean convertable;
    public boolean editable;
    public boolean emailTemplate_support;
    public ArrayList<Profile> profiles;
    public boolean filter_supported;
    public boolean show_as_tab;
    public Object web_link;
    public int sequence_number;
    public String singular_label;
    public boolean viewable;
    public boolean api_supported;
    public String api_name;
    public boolean quick_create;
    public Object modified_by;
    public String generated_type;
    public boolean feeds_required;
    public boolean scoring_supported;
    public boolean webform_supported;
    public ArrayList<Object> arguments;
    public String module_name;
    public int business_card_field_limit;
    public ParentModule parent_module;
	public boolean isGlobal_search_supported() {
		return global_search_supported;
	}
	public void setGlobal_search_supported(boolean global_search_supported) {
		this.global_search_supported = global_search_supported;
	}
	public boolean isDeletable() {
		return deletable;
	}
	public void setDeletable(boolean deletable) {
		this.deletable = deletable;
	}
	public Object getDescription() {
		return description;
	}
	public void setDescription(Object description) {
		this.description = description;
	}
	public boolean isCreatable() {
		return creatable;
	}
	public void setCreatable(boolean creatable) {
		this.creatable = creatable;
	}
	public boolean isInventory_template_supported() {
		return inventory_template_supported;
	}
	public void setInventory_template_supported(boolean inventory_template_supported) {
		this.inventory_template_supported = inventory_template_supported;
	}
	public Object getModified_time() {
		return modified_time;
	}
	public void setModified_time(Object modified_time) {
		this.modified_time = modified_time;
	}
	public String getPlural_label() {
		return plural_label;
	}
	public void setPlural_label(String plural_label) {
		this.plural_label = plural_label;
	}
	public boolean isPresence_sub_menu() {
		return presence_sub_menu;
	}
	public void setPresence_sub_menu(boolean presence_sub_menu) {
		this.presence_sub_menu = presence_sub_menu;
	}
	public boolean isTriggers_supported() {
		return triggers_supported;
	}
	public void setTriggers_supported(boolean triggers_supported) {
		this.triggers_supported = triggers_supported;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isBlueprintSupported() {
		return isBlueprintSupported;
	}
	public void setBlueprintSupported(boolean isBlueprintSupported) {
		this.isBlueprintSupported = isBlueprintSupported;
	}
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	public boolean isConvertable() {
		return convertable;
	}
	public void setConvertable(boolean convertable) {
		this.convertable = convertable;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public boolean isEmailTemplate_support() {
		return emailTemplate_support;
	}
	public void setEmailTemplate_support(boolean emailTemplate_support) {
		this.emailTemplate_support = emailTemplate_support;
	}
	public ArrayList<Profile> getProfiles() {
		return profiles;
	}
	public void setProfiles(ArrayList<Profile> profiles) {
		this.profiles = profiles;
	}
	public boolean isFilter_supported() {
		return filter_supported;
	}
	public void setFilter_supported(boolean filter_supported) {
		this.filter_supported = filter_supported;
	}
	public boolean isShow_as_tab() {
		return show_as_tab;
	}
	public void setShow_as_tab(boolean show_as_tab) {
		this.show_as_tab = show_as_tab;
	}
	public Object getWeb_link() {
		return web_link;
	}
	public void setWeb_link(Object web_link) {
		this.web_link = web_link;
	}
	public int getSequence_number() {
		return sequence_number;
	}
	public void setSequence_number(int sequence_number) {
		this.sequence_number = sequence_number;
	}
	public String getSingular_label() {
		return singular_label;
	}
	public void setSingular_label(String singular_label) {
		this.singular_label = singular_label;
	}
	public boolean isViewable() {
		return viewable;
	}
	public void setViewable(boolean viewable) {
		this.viewable = viewable;
	}
	public boolean isApi_supported() {
		return api_supported;
	}
	public void setApi_supported(boolean api_supported) {
		this.api_supported = api_supported;
	}
	public String getApi_name() {
		return api_name;
	}
	public void setApi_name(String api_name) {
		this.api_name = api_name;
	}
	public boolean isQuick_create() {
		return quick_create;
	}
	public void setQuick_create(boolean quick_create) {
		this.quick_create = quick_create;
	}
	public Object getModified_by() {
		return modified_by;
	}
	public void setModified_by(Object modified_by) {
		this.modified_by = modified_by;
	}
	public String getGenerated_type() {
		return generated_type;
	}
	public void setGenerated_type(String generated_type) {
		this.generated_type = generated_type;
	}
	public boolean isFeeds_required() {
		return feeds_required;
	}
	public void setFeeds_required(boolean feeds_required) {
		this.feeds_required = feeds_required;
	}
	public boolean isScoring_supported() {
		return scoring_supported;
	}
	public void setScoring_supported(boolean scoring_supported) {
		this.scoring_supported = scoring_supported;
	}
	public boolean isWebform_supported() {
		return webform_supported;
	}
	public void setWebform_supported(boolean webform_supported) {
		this.webform_supported = webform_supported;
	}
	public ArrayList<Object> getArguments() {
		return arguments;
	}
	public void setArguments(ArrayList<Object> arguments) {
		this.arguments = arguments;
	}
	public String getModule_name() {
		return module_name;
	}
	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}
	public int getBusiness_card_field_limit() {
		return business_card_field_limit;
	}
	public void setBusiness_card_field_limit(int business_card_field_limit) {
		this.business_card_field_limit = business_card_field_limit;
	}
	public ParentModule getParent_module() {
		return parent_module;
	}
	public void setParent_module(ParentModule parent_module) {
		this.parent_module = parent_module;
	}
	@Override
	public String toString() {
		return "Module [global_search_supported=" + global_search_supported + ", deletable=" + deletable + ", description=" + description + ", creatable=" + creatable + ", inventory_template_supported=" + inventory_template_supported + ", modified_time=" + modified_time + ", plural_label=" + plural_label + ", presence_sub_menu=" + presence_sub_menu + ", triggers_supported=" + triggers_supported + ", id=" + id + ", isBlueprintSupported=" + isBlueprintSupported + ", visibility=" + visibility + ", convertable=" + convertable + ", editable=" + editable + ", emailTemplate_support=" + emailTemplate_support + ", profiles=" + profiles + ", filter_supported=" + filter_supported + ", show_as_tab=" + show_as_tab + ", web_link=" + web_link + ", sequence_number=" + sequence_number + ", singular_label=" + singular_label + ", viewable=" + viewable + ", api_supported=" + api_supported + ", api_name=" + api_name + ", quick_create=" + quick_create + ", modified_by=" + modified_by + ", generated_type=" + generated_type + ", feeds_required=" + feeds_required + ", scoring_supported=" + scoring_supported + ", webform_supported=" + webform_supported + ", arguments=" + arguments + ", module_name=" + module_name + ", business_card_field_limit=" + business_card_field_limit + ", parent_module=" + parent_module + "]";
	}
	
}
