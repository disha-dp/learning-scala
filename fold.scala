val numbers = List(5, 4, 8, 6, 2)
numbers.fold(0) { (z, i) =>
  z + i
}
