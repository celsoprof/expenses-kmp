package data

import model.Expense
import model.ExpenseCategory

object ExpenseManager{

  private var currentId = 1L

  val fakeExpsenseList = mutableListOf(
    Expense(
      id = currentId++,
      amount = 70.00,
      category = ExpenseCategory.GROCERIES,
      description = "Weekly buy"
    ),
    Expense(
      id = currentId++,
      amount = 10.02,
      category = ExpenseCategory.SNACKS,
      description = "Hommies"
    ),
    Expense(
      id = currentId++,
      amount = 21000.0,
      category = ExpenseCategory.CAR,
      description = "Audi A1"
    ),
    Expense(
      id = currentId++,
      amount = 120.0,
      category = ExpenseCategory.PARTY,
      description = "Weekend party"
    ),
    Expense(
      id = currentId++,
      amount = 25.00,
      category = ExpenseCategory.HOUSE,
      description = "Cleaning"
    ),
    Expense(
      id = currentId++,
      amount = 99.99,
      category = ExpenseCategory.OTHER,
      description = "Services"
    ),
    Expense(
      id = currentId++,
      amount = 9.99,
      category = ExpenseCategory.COFFEE,
      description = "Daily coffee"
    )
  )

  fun addNewExpense(expense: Expense){
    fakeExpsenseList.add(expense.copy(id = currentId++))
  }

  fun editExpense(expense: Expense){
    val index = fakeExpsenseList.indexOfFirst {
      it.id == expense.id
    }

    if (index != -1){
      fakeExpsenseList[index] = fakeExpsenseList[index].copy(
        amount = expense.amount,
        category = expense.category,
        description = expense.description
      )
    }
  }

  fun getCategories(): List<ExpenseCategory>{
    return listOf(
      ExpenseCategory.GROCERIES,
      ExpenseCategory.PARTY,
      ExpenseCategory.SNACKS,
      ExpenseCategory.COFFEE,
      ExpenseCategory.CAR,
      ExpenseCategory.HOUSE,
      ExpenseCategory.OTHER,
    )
  }

}