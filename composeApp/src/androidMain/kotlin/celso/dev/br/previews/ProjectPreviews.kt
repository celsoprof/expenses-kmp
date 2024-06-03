package celso.dev.br.previews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import data.ExpenseManager
import model.Expense
import model.ExpenseCategory
import ui.AllExpensesHeader
import ui.ExpensesItem
import ui.ExpensesScreen
import ui.ExpensesTotalHeader

@Preview(showBackground = true)
@Composable
private fun ExpensesTotalHeaderPreview() {
  Box(modifier = Modifier.padding(8.dp)){
    ExpensesTotalHeader(total = 1028.99)
  }
}

@Preview(showBackground = true)
@Composable
private fun AllExpensesPreview() {
  Box(modifier = Modifier.padding(8.dp)){
    AllExpensesHeader()
  }
}

@Preview(showBackground = true)
@Composable
private fun ExpensesItemPreview() {
  Box(modifier = Modifier.padding(8.dp)){
    ExpensesItem(
      expense = ExpenseManager.fakeExpsenseList[5],
      onExpenseClick = {}
    )
  }
}

@Preview(showBackground = true)
@Composable
private fun ExpenseScreenPreview() {
  Box(modifier = Modifier.padding(8.dp)){
    ExpensesScreen(onExpenseClick = {})
  }
}