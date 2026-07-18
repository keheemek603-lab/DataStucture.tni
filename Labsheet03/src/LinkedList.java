public class LinkedList {

    private node head;

    
    public LinkedList() {
        head = null;
    }

    
    public String traversal() {

        String result = "[";

        node current_node = head;

        boolean first = true;

        while (current_node != null) {

            if (!first) {
                result += ", ";
            }

            result += current_node.data;

            first = false;

            current_node = current_node.next;
        }

        result += "]";

        return result;
    }

    
    public void insert(int position, Object value) {

        node new_node = new node(value);

        
        if (head == null) {

            head = new_node;
            return;

        }

        
        if (position == 0) {

            new_node.next = head;
            head = new_node;
            return;

        }

        node current_node = head;

        int current_position = 0;

        while (current_position < position - 1 &&
               current_node.next != null) {

            current_node = current_node.next;
            current_position++;
        }

        new_node.next = current_node.next;
        current_node.next = new_node;
    }

    
    public void insert(Object value) {

        node new_node = new node(value);

        if (head == null) {

            head = new_node;
            return;

        }

        node current_node = head;

        while (current_node.next != null) {

            current_node = current_node.next;

        }

        current_node.next = new_node;
    }

    
    public void remove(int position) {

        if (head == null) {

            return;

        }

        
        if (position == 0) {

            head = head.next;
            return;

        }

        node current_node = head;

        int current_position = 0;

        while (current_position < position - 1 &&
               current_node.next.next != null) {

            current_node = current_node.next;
            current_position++;

        }

        current_node.next = current_node.next.next;

    }

    
    public void removeLastElement() {

        if (head == null) {

            return;

        }

        if (head.next == null) {

            head = null;
            return;

        }

        node current_node = head;

        while (current_node.next.next != null) {

            current_node = current_node.next;

        }

        current_node.next = null;

    }

    
    public int length() {

        int count = 0;

        node current_node = head;

        while (current_node != null) {

            count++;

            current_node = current_node.next;

        }

        return count;

    }

    
    public Object get(int position) {

        node current_node = head;

        int current_position = 0;

        while (current_node != null) {

            if (current_position == position) {

                return current_node.data;

            }

            current_node = current_node.next;
            current_position++;

        }

        return null;

    }

    
    public void set(int position, Object value) {

        node current_node = head;

        int current_position = 0;

        while (current_node != null) {

            if (current_position == position) {

                current_node.data = value;
                return;

            }

            current_node = current_node.next;
            current_position++;

        }

    }

    
    public void clear() {

        head = null;

    }

}