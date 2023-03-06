Program created with javaFx technology as a final project for subject named Advanced Programming Techniques.
Simple program that allows users to manage purchase documents like receipt and invoices. User is able to:
-> access to the database storing data on orders and their history
-> create a document confirming the purchase (invoice/receipt)
-> sort documents
-> preview details of the document

Project has been implemented with using design patterns: 
-> singleton - out bd which store the information od all documents
-> fascade   - providing an interface for much easier database operation\
-> strategy  - appropriate sorting of data in relation to chosen parameter, such as: id document or document 
               creation date, the context in this case is the History class
-> builder   - to create a document confirming the purchase of a given order
-> factory method - to add individual components to the purchasing document like graphic card or motherboard
-> decorator - to assign a new promotional price to components, e.g. price sale price or a price that includes the customer's discount code
-> MVC       - whole project | in package named resorces are fxml file which represent views 
