package lecture04;

import java.util.*;
import java.util.ArrayDeque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();
    }
}
