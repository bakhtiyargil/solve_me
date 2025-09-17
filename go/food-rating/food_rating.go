package main

type FoodRatings struct {
	foods    []string
	cuisines []string
	ratings  []int
}

func Constructor(foods, cuisines []string, ratings []int) FoodRatings {
	return FoodRatings{
		foods:    foods,
		cuisines: cuisines,
		ratings:  ratings,
	}
}

func (this *FoodRatings) ChangeRating(food string, newRating int) {
	for i := 0; i < len(this.foods); i++ {
		if this.foods[i] == food {
			this.ratings[i] = newRating
		}
	}
}

func (this *FoodRatings) HighestRated(cuisine string) string {
	highestRating := 0
	highestFood := ""

	for i := 0; i < len(this.ratings); i++ {
		if this.cuisines[i] == cuisine {
			if this.ratings[i] > highestRating {
				highestRating = this.ratings[i]
				highestFood = this.foods[i]
			} else if this.ratings[i] == highestRating {
				if highestFood == "" || this.foods[i] < highestFood {
					highestFood = this.foods[i]
				}
			}
		}
	}
	return highestFood
}
