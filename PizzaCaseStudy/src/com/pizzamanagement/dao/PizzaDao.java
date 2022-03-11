
package com.pizzamanagement.dao;

import com.pizzamanagement.model.Pizza;

public interface PizzaDao {
	// CRUD operations for pizza
	void addPizza(Pizza pizza);
	void updatePizza(Pizza pizza);
	void deletePizza(Pizza pizza);
	Pizza getPizzaByNo(int id);
	void beginTransaction();
	void commitTransaction();

}