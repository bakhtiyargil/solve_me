package main

import "fmt"

func main() {
	foods := []string{"sushi", "pizza", "burger", "ramen"}
	cuisines := []string{"japanese", "italian", "american", "japanese"}
	ratings := []int{5, 7, 6, 8}

	obj := Constructor(foods, cuisines, ratings)
	obj.ChangeRating("sushi", 10)
	fmt.Println(obj.HighestRated("japanese"))
}
