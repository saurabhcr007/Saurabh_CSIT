public int compareVersion(String version1, String version2) {
        int m = version1.length(), n = version2.length();
        int i = 0, j = 0;
        
        while(i < m || j < n) {
            int x = 0;
            for (; i < m && version1.charAt(i) != '.'; i++) {
                x =  x * 10 + (version1.charAt(i) - '0');
            }
            i++;
            
            int y = 0;
            for (; j < n && version2.charAt(j) != '.'; j++) {
                y = y * 10 + (version2.charAt(j) - '0');
            }
            j++;
            
            if (x != y) {
                return x > y ? 1 : -1;
            }
        }
        return 0;
    }