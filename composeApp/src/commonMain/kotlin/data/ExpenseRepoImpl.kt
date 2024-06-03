package data

import domain.ExpenseRepository
import model.Expense
import model.ExpenseCategory

class ExpenseRepoImpl : ExpenseRepository {
  override fun getAllExpenses(): List<Expense> {
    return ExpenseManager.fakeExpsenseList
  }

  override fun addExpense(expense: Expense) {
    ExpenseManager.addNewExpense(expense)
  }

  override fun editExpense(expense: Expense) {
    ExpenseManager.editExpense(expense)
  }

  override fun getCategories(): List<ExpenseCategory> {
    return ExpenseManager.getCategories()
  }
}