# MultiThread
[Наблюдения по задаче 3](https://github.com/MsLFoxGit/MultiThread/blob/master/README.md#L45)
____
## Задача 1. Межпоточный диалог
#### Описание
Cоздать (3-4 потока) которые каждые 2-3 секунды отправляют в консоль 
некоторое сообщение, обязательно содержащее имя потока, которое было задано при создании. Поток должен выполнять бесконечный цикл вывода сообщения и сна (задержки). 
Главный поток программы (метод main) должен дать поработать остальным потокам какое-то время (секунд 15), а потом одним методом завершить все созданные ранее потоки.

#### Функционал программы
- :white_check_mark: Создание 4 потоков, каждый из которых имеет свое имя. 
- :white_check_mark: Каждые 2-3 секунды поток печатает сообщение в консоль. Обязательно в сообщении должно фигурировать имя потока
- :white_check_mark: Через какое-то время (например 15 секунд), главный поток должен одним методом завершить все созданные ранее потоки
### ***Решение:***
[ MultiThread.Task 1 'Interthread Dialog'](https://github.com/MsLFoxGit/MultiThread/commit/77a24f29279aee61c71ec8e77b47f52e8094209e)
____
## Задача 2. Межпоточный диалог со счетчиком
#### Описание
Модифицируйте код для потоков из предыдущей задачи таким образом, чтобы это была Callable-задача, возвращающая кол-во выведенных в консоль сообщений, 
а цикл выполнения был конечен. Запустите некоторое кол-во этих задач в пул потоков фиксированного количества и получите результаты выполнения задач. 
Проведите аналогичную операцию, но с получением результата от одной из задач (pool.invokeAny())

#### Функционал программы
- :white_check_mark: Создание 4 потоков, каждый из которых имеет свое имя.
- :white_check_mark: Каждые 2-3 секунды поток печатает сообщение в консоль. Обязательно в сообщении должно фигурировать имя потока
### ***Решение:***
[ MultiThread.Task 2 'Interthread Dialog with counter'](https://github.com/MsLFoxGit/MultiThread/commit/ec5efe33d50ff58bf1b386f2a25aae876a6e14b0)
____
## Задача 3. Калькулятор массива
#### Описание
Вам нужно написать программу, которая подсчитывает сумму и среднее арифметическое элементов массива. 
Нужно представить однопоточное и многопоточное решение, а также попытаться сравнить время выполнения обоих решений. 
Для начала, сгенерируйте целочисленный массив большого размера, а затем попробуйте сделать для него расчеты в обоих режимах, фиксируя время. 
Попробуйте изменить количество элементов массива и оценить, насколько эффективнее использовать параллельные расчеты на большом массиве 
и падение эффективности на небольших массивах.
Используйте `ForkJoinPool`

#### Функционал программы
- :white_check_mark: Создание заполненного массива целых чисел.
- :white_check_mark: Однопоточный подсчет суммы элементов массива.
- :white_check_mark: Многопоточный подсчет суммы элементов массива.
### ***Решение:***
[MultiThread.Task 3 'ArraySum() ForkJoinPool'](https://github.com/MsLFoxGit/MultiThread/commit/25f62ff153dafa17ba88317d50ddebfc7d01c514)

### Наблюдения к задаче 3
