package com.example.LadyJanesApp;

//import com.mongodb.MongoClientSettings;
//import com.mongodb.MongoCredential;
//import com.mongodb.ServerAddress;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoDatabase;
//
//import java.util.Arrays;
//
//public class ConnectToDB {
//
//    private static MongoClient mongo;
//
//    public static void main(String[] args){
//
//    MongoClient mongoClient = MongoClients.create(
//            MongoClientSettings.builder()
//                    .applyToClusterSettings(builder ->
//                            builder.hosts(Arrays.asList(new ServerAddress("hostOne"))))
//                    .build());
//
//    // Creating Credentials
//    MongoCredential credential;
//    credential = MongoCredential.createCredential("sampleUser", "myDb",
//            "password".toCharArray());
//    System.out.println("Connected to the database successfully");
//
//    // Accessing the database
//        MongoDatabase database = mongo.getDatabase("myDb");
//    System.out.println("Credentials ::"+ credential);
//}
//}
