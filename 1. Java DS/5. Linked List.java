//Unsorted 
        LinkedList list = new LinkedList(); 
        LinkedList listClone = new LinkedList(); 
         
        list.add(1); 
        list.add(1, 2); 
        list.addFirst(0); 
        list.addLast(3); 
         
        listClone = (LinkedList) list.clone(); 
        System.out.println(listClone); 
         
        System.out.println(list.get(0)); 
        System.out.println(list.getFirst()); 
        System.out.println(list.getLast()); 
         
        System.out.println(list.indexOf(3));   // search 
        list.set(0, 10); 
        System.out.println(list.remove()); 
         
        list.clear(); 
        list.size(); 
 
Collections.sort(list);   // sort list 
