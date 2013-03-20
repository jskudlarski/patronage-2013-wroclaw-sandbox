package models

import Math.abs

object NQueens {
  private def isQueenSafe(col: Int, queens: List[Int]): Boolean = 
    queens.zipWithIndex forall { case (x, y) => abs(x - col) != y + 1 }

  private def correctSolution(solution: List[Int]): Boolean = solution match {
    case Nil => true
    case col :: tail => isQueenSafe(col, tail) && correctSolution(tail)
  }

  def placeQueens(n: Int): Iterator[List[Int]] =
    (0 to n-1).toList.permutations filter correctSolution

  val EightQueensSolution = placeQueens(8).toList
}

