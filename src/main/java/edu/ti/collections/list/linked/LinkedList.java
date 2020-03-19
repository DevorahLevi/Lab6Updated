package edu.ti.collections.list.linked;

public class LinkedList {
    private class Node {
        Object payload;
        Node next = null;

        public Node(Object payload) {
            this.payload = payload;
        }

        public Object getPayload() {
            return payload;
        }

        public void setPayload(Object payload) {
            this.payload = payload;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head = null;

    public LinkedList()
    {
        // nothing
    }

    public LinkedList(Object payload) {
        head = new Node(payload);
    }

    public boolean isEmpty() {
        return (head == null);
    }

    //TODO -- implement private helper method end that returns last Node in list
    private Node end()
    {
        Node endNode = head;
        while (endNode.getNext() != null)
        {
            endNode = endNode.getNext();
        }
        return endNode;
    }

    //TODO -- implement size to return number of Nodes in list
    public int size()
    {
        Node endNode = head;
        int count = 1;
        while (endNode.getNext() != null)
        {
            endNode = endNode.getNext();
            count++;
        }
        return count;
    }

    //TODO -- implement insert, which inserts Node for object as new head of list
    public void insert(Object object)
    {
        Node newNode = new Node(object);
        newNode.setNext(head);
        head = newNode;
    }

    //TODO -- implement append, that appends Node to end of list
    public void append(Object object)
    {
        Node endNode = this.end();
        Node newNode = new Node(object);
        endNode.setNext(newNode);
    }

    //TODO -- implement get to retrieve the n-th object in the list,
    //        return null if n > (size() - 1)
    public Object get(int n)
    {
        Node node = head;
        if (n > this.size() -1)
        {
            return null;
        }
        else
        {
            for (int count = 0; count < n; count++)
            {
                node = node.getNext();
            }
        }
        return node.getPayload();
    }

    //TODO -- implement remove to remove n-th element of list,
    //        return Object if n < size(), null otherwise
    public Object remove(int n) {
        Node currentNode = head, previous = new Node(null);
        Object deleted = null;
        if (n < this.size()) {
            if (n == 0) {
                head = currentNode.getNext();
                return currentNode.getPayload();
            } else {
                int counter = 0;
                while (currentNode != null) {
                    if (counter == n) {
                        previous.next = currentNode.getNext();
                        return currentNode.getPayload();
                    } else {
                        previous = currentNode;
                        currentNode = currentNode.getNext();
                        counter++;
                    }
                }
            }
        }
        else
            {
                return null;
            }
        return null;
    }

    //TODO -- implement remove to remove given object from list,
    //        return Object if object is in the list, null otherwise
    public Object remove(Object object) {
        return null;
    }
}