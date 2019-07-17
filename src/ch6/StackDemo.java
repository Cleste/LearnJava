package ch6;
/*Помимо очереди, в программах часто используется структура данных, которая
называется стеком. Обращение к стеку осуществляется по принципу "первым
пришел - последним обслужен". Стек можно сравнить со стопкой тарелок, стоящих на столе. Последней берется тарелка, поставленная на стол первой. Создайте класс Stack, реализующий стек для хранения символов. Используйте методы
push ( ) и рор () для манипулирования содержимым стека. Пользователь класса
Stack должен иметь возможность задавать размер стека при ero создании. Все
члены класса Stack, кроме методов push () и рор (), должны быть объявлены
как pri vate. (Подсказка: в качестве исходной заготовки можете воспользоваться
классом Queue, изменив в нем лишь способ доступа к данным.)*/
public class StackDemo {
    public static void main(String[] args) {
        char[] queueArr = {'A', 'B', 'E'};
        Stack Stack1 = new Stack(queueArr);
        Stack Stack2 = new Stack(Stack1);
        Stack1.showStack();
        System.out.println();
        Stack2.showStack();
        Stack1.push('Z');
        System.out.println("\n" + Stack1.pop());

    }
}

class Stack {
    private char[] StackArr;
    private int index;

    Stack(int size) {
        StackArr = new char[size + 1];
        index = 0;
    }

    Stack(Stack obj) {
        index = obj.index;
        StackArr = new char[obj.StackArr.length];

        for (int i = 0; i <= index; i++) StackArr[i] = obj.StackArr[i];
    }

    void push(char sumb) {
        if (index == StackArr.length - 1) {
            System.out.println("Stack is full.");
            return;
        }
        index++;
        StackArr[index] = sumb;
    }

    Stack(char[] arr) {
        index = 0;
        StackArr = new char[arr.length + 1];
        for (char c : arr) push(c);
    }

    char pop() {
        if (index == 0) {
            System.out.println("Stack is empty.");
            return (char) 0;
        }
        return StackArr[index--];
    }

    void showStack() {
        System.out.println("Stack contents: ");
        do {
            System.out.print(pop());
        } while (index != 0);

    }
}