Approach1=> Bitmasking 

public long minEnd(int n, int x) {
        long result = x;
        long remaining = n - 1;
        long position = 1;
        
        while (remaining != 0) {
            if ((x & position) == 0) {
                result |= (remaining & 1) * position;
                remaining >>= 1;
            }
            position <<= 1;
        }
        
        return result;
    }

Approach2=> 

   public long minEnd(int n, int x) {
        // Store available bit positions that are 0 in x
        ArrayList<Integer> shifts = new ArrayList<>();
        
        // Initialize result with starting number x
        long cur = x;
        
        // Calculate how many 1's we need to add (n-1)
        long calc = n - 1;
        
        // Find all bit positions that are 0 in x (up to 32 bits)
        for(int i = 0; i < 32; i++) {
            if((x & (1 << i)) == 0) {
                shifts.add(i);
            }
        }
        
        // Add remaining positions 32-63 since long is 64 bit
        for(int i = 32; i < 64; i++) {
            shifts.add(i);
        }
        
        // Process each bit in calc (n-1)
        // If bit is 1, set that bit in next available position from shifts
        for(int i = 0; calc > 0; i++, calc >>= 1) {
            cur += (calc & 1L) << shifts.get(i);
        }
        
        return cur;
    }


public long minEnd(int n, int x) {
        ArrayList<Integer> shifts = new ArrayList<>();
        long cur = x;
        long calc = n - 1;
        
        for(int i = 0; i < 32; i++) {
            if((x & (1 << i)) == 0) {
                shifts.add(i);
            }
        }
        
        for(int i = 32; i < 64; i++) {
            shifts.add(i);
        }
        
        for(int i = 0; calc > 0; i++, calc >>= 1) {
            cur += (calc & 1L) << shifts.get(i);
        }
        
        return cur;
    }

