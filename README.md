# Филип Краљевски 203141
## Control Flow Graph

![CFG](https://user-images.githubusercontent.com/86956087/170093272-edc738a0-1d64-443c-ba21-19692cd07295.png)

## Цикломатска комплексност

Цикломатската комплексност на овој код е 9, истата ја добив преку формулата R(Regions), каде што R е бројот на региони. Во случајoв R=9, 
па цикломатската комплексност изнесува 9.

## Тест случаи според критериумот Every statement

|Every Statement|List = [ ]|List = [0, 0, #, 0, #]|List = ["0", "#", "0", "#", "0", "#", "0", "#", "0"]|
|---------------|----------|----------------------|----------------------------------------------------|
1| 1 | 1 | 1
2| 1 | 1 |1
3| 1		
4|		 |	1	 |		1
5|		 |	1	 |		1
6|		 |	1	 |		1
7|		 |  1  |
8|		 |		 |    1
9.1|		 |		 |    1
9.2|		 |		 |    1
9.3|		 |		 |    1
10|		 |		 |    1
11|		 |		 |    1
12|		 |		 |    1
13|		 |		 |    1
14|		 |		 |    1
15|		 |		 |    1
16|		 |		 |    1
17|		 |		 |    1
18|		 |		 |    1
19|		 |		 |    1
20|		 |		 |    1
21|		 |		 |    1
22|		 |		 |    1
23|		 |		 |    1
24|	1	 |  1	 |		1

1. Првиот тест случај е кога листата ни е празна и го фрла исклучокот што пишува "List length should be greater than 0"
2. Вториот тест случај е кога големината на листата не е перфектен квадратен корен каде го фрла исклучокот "List length should be a perfect square"
3. Третиот тест случај е кога не фрламе исклучок и ги поминуваме сите линии од кодот.

## Тест случаи според критериумот Every branch

|Every Branch|List = [ ]|List = [0, 0, #, 0, #]|List = ["0", "#", "0", “0”, "#", "0", "#", “0”, "0", "#", "0", “0”, “#”, “#”, “#”, “#”]|
|------------|----------|----------------------|---------------------------------------------------------------------------------------|
1,2 – 3|		1		
1,2 – 4,5,6|  | 1 | 1
3 – 24|		1		
4,5,6 – 7|	|	1	
4,5,6 – 8|	|	 | 1
7 – 24|	 | 1	
8 – 9.1|  |  | 1 
9.1 – 9.2|  |  | 1 
9.2 – 10|  |  | 1 
10 – 11,12|  |  | 1 
10 – 21|  |  | 1 
11,12 – 13|  |  | 1 
11,12 – 16|  |  | 1 
13 – 14|  |  | 1 
13 – 15|  |  | 1 
14 – 16|  |  | 1 
15 – 16|  |  | 1 
16 – 17|  |  | 1 
16 – 18|  |  | 1 
17 – 18|  |  | 1 
18 – 19|  |  | 1 
18 – 20|  |  | 1 
19 – 20|  |  | 1 
20 – 22|  |  | 1 
21 – 22|  |  | 1 
22 – 9.3|  |  | 1 
9.3 – 9.2|  |  | 1 
9.2 – 23|  |  | 1 
23 – 24|  |  | 1 

1. Првиот тест случај е кога листата ни е празна и го фрла исклучокот што пишува "List length should be greater than 0"
2. Вториот тест случај е кога големината на листата не е перфектен квадратен корен каде го фрла исклучокот "List length should be a perfect square"
3. Третиот тест случај е кога не фрламе исклучок и ги поминуваме бранчови во кодот.

## Објаснување на напишаните unit tests

1. Првиот тест е наречен testEveryStatement и во него три тест случаи:
	* Првиот тест случај користиме IllegalArgumentException ex, каде ex = assertThrows со што потоа ја проверуваме пораката на 
	исклучокот со assertTrue за да се осигураме дека се работи за истиот исклучок
	* Вториот тест случај има иста структура со претходниот тест случај само што пораката што ја проверуваме е различна
	* Третиот тест слулај креираме List<String> test, каде test ќе биде еднаква на точните одговори кој ги очекуваме како резултат, а за
	да ги провериме користиме assertEquals
2. Вториот тест е наречен testEveryBranch
	* Првиот тест случај користиме IllegalArgumentException ex, каде ex = assertThrows со што потоа ја проверуваме пораката на 
	исклучокот со assertTrue за да се осигураме дека се работи за истиот исклучок
	* Вториот тест случај има иста структура со претходниот тест случај само што пораката што ја проверуваме е различна
	* Третиот тест слулај креираме List<String> test, каде test ќе биде еднаква на точните одговори кој ги очекуваме како резултат, а за
	да ги провериме користиме assertEquals
