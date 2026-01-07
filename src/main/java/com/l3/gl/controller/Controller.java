package com.l3.gl.controller;

import com.l3.gl.model.Product;
import com.l3.gl.model.User;
import com.l3.gl.view.Ui;

public class Controller {
   Ui view;
   Product product;
   User user;

  public Controller(Product product, User user) {
    this.product = product;
    this.user = user;
  }

  public String sayHello() {
    return "hello from controller";
  }

   void showDetails() {
    // your work
  }
}