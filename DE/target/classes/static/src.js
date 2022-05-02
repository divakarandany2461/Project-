 function populate(){
	 
	  const map = new Map();
	  var leads=document.getElementById("Leads");
	  var leadsn=document.getElementById("Leadsn");
	  if(leads.checked==true)
	  {
	    map.set(leads.value,leadsn.value);
	 
	  }
	  var Contacts=document.getElementById("Contacts");
	  var Contactsn=document.getElementById("Contactsn");
	  if(Contacts.checked==true)
	  {
		  map.set(Contacts.value,Contactsn.value);
	  }
	  
	  var Accounts=document.getElementById("Accounts");
	  var Accountsn=document.getElementById("Accountsn");
	  if(Accounts.checked==true)
	  {
		  map.set(Accounts.value,Accountsn.value);
	  }
	  var Deals=document.getElementById("Deals");
	  var Dealsn=document.getElementById("Dealsn");
	  if(Deals.checked==true)
	  {
		  map.set(Deals.value,Dealsn.value);
	  }
	 
	  var Calls=document.getElementById("Calls");
	  var Callsn=document.getElementById("Callsn");
	  if(Calls.checked==true)
	  {
		  map.set(Calls.value,Callsn.value);
	  }
	  var Tasks=document.getElementById("Tasks");
	  var Tasksn=document.getElementById("Tasksn");
	  if(Tasks.checked==true)
	  {
		  map.set(Tasks.value,Tasksn.value);
	  }
	  
	  var Meetings=document.getElementById("Meetings");
	  var Meetingsn=document.getElementById("Meetingsn");
	  if(Meetings.checked==true)
	  {
		  map.set(Meetings.value,Meetingsn.value);
	  }
	  var Activities=document.getElementById("Activities");
	  var Activitiesn=document.getElementById("Activitiesn");
	  if(Activities.checked==true)
	  {
		  map.set(Activities.value,Activitiesn.value);
	  }
	 
	  var Products=document.getElementById("Products");
	  var Productsn=document.getElementById("Productsn");
	  if(Products.checked==true)
	  {
		  map.set(Products.value,Productsn.value);
	  }
	  var Quotes=document.getElementById("Quotes");
	  var Quotesn=document.getElementById("Quotesn");
	  if(Quotes.checked==true)
	  {
		  map.set(Quotes.value,Quotesn.value);
	  }
	 
	  var SalesOrders=document.getElementById("Sales Orders");
	  var SalesOrdersn=document.getElementById("Sales Ordersn");
	  if(SalesOrders.checked==true)
	  {
		  map.set(SalesOrders.value,SalesOrdersn.value);
	  }
	  var PurchaseOrders=document.getElementById("Purchase Orders");
	  var PurchaseOrdersn=document.getElementById("Purchase Ordersn");
	  if(PurchaseOrders.checked==true)
	  {
		  map.set(PurchaseOrders.value,PurchaseOrdersn.value);
	  }
	  var Invoices=document.getElementById("Invoices");
	  var Invoicesn=document.getElementById("Invoicesn");
	  if(Invoices.checked==true)
	  {
		  map.set(Invoices.value,Invoicesn.value);
	  }
	  var Campaigns=document.getElementById("Campaigns");
	  var Campaignsn=document.getElementById("Campaignsn");
	  if(Campaigns.checked==true)
	  {
		  map.set(Campaigns.value,Campaignsn.value);
	  }
	  
	  var Vendors=document.getElementById("Vendors");
	  var Vendorsn=document.getElementById("Vendorsn");
	  if(Vendors.checked==true)
	  {
		  map.set(Vendors.value,Vendorsn.value);
	  }
	  var PriceBooks=document.getElementById("Price Books");
	  var PriceBooksn=document.getElementById("Price Booksn");
	  if(PriceBooks.checked==true)
	  {
		  map.set(PriceBooks.value,PriceBooksn.value);
	  }
	  var Cases=document.getElementById("Cases");
	  var Casesn=document.getElementById("Casesn");
	  if(Cases.checked==true)
	  {
		  map.set(Cases.value,Casesn.value);
	  }
	  var Solutions=document.getElementById("Solutions");
	  var Solutionsn=document.getElementById("Solutionsn");
	  if(Solutions.checked==true)
	  {
		  map.set(Solutions.value,Solutionsn.value);
	  }
	  var Notes=document.getElementById("Notes");
	  var Notesn=document.getElementById("Notesn");
	  if(Notes.checked==true)
	  {
		  map.set(Notes.value,Notesn.value);
	  }
	  var Attachments=document.getElementById("Attachments");
	  var Attachmentsn=document.getElementById("Attachmentsn");
	  if(Attachments.checked==true)
	  {
		  map.set(Attachments.value,Attachmentsn.value);
	  }
	
	  
	  const obj = Object.fromEntries(map);
	 
	  var requestOptions = {
			    method: 'POST',
			    headers: { 'Content-Type': 'application/json' },
			    body: JSON.stringify(obj)
			};
	  console.log(JSON.stringify(obj));
	  fetch("http://localhost:8080/map1",requestOptions)
	  	.then(response => response.text())
	  	.then(data => {
	  		document.getElementById("demo").innerHTML="Zip File Downloaded";
	  		var url=data;
	  		 window.open(url);
	  	     console.log(url);
	        //  window.location.href = "/home/local/ZOHOCORP/divakar-pt5261/Downloads/demo/test.zip";

  
	  	})
}
