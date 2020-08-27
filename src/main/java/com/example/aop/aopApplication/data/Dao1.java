package com.example.aop.aopApplication.data;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
   public String retrieveSomething() {
	   return "Dao1";
   }
}

//ctrl + shift +O