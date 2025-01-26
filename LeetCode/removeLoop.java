// Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // Step 1: Detect the loop using Floyd's Cycle Detection Algorithm
        Node slow = head;
        Node fast = head;
    
        // Check if a loop exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break; // Loop detected
            }
        }
    
        // If no loop exists, return
        if (slow != fast) {
            return;
        }
    
        // Step 2: Find the starting point of the loop
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
    
        // Step 3: Find the last node of the loop
        Node lastNode = slow;
        while (lastNode.next != slow) {
            lastNode = lastNode.next;
        }
    
        // Step 4: Remove the loop by setting the last node's next to null
        lastNode.next = null;

    }
