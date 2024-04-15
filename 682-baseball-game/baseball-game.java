class Solution {
    public int calPoints(String[] operations) {
        //Approach:
        //TC:()| SC:()
        // int n=operations.length;
        // int score=0;
        // for(int i=0; i<n; i++)
        // {
            
        //     if(operations[i]=="+" && op.size()>=2)
        //         score+= Integer.parseInt(operations[i-1])+ Integer.parseInt(operations[i-2]);
        //     if(operations[i]=="D" && op.size()>=1)
        //         score+=2*Integer.parseInt(operations[i-1]);
        //     if(operations[i]=="C" && op.size()>=1)
        //         score-= Integer.parseInt(operations[i-1]);
        //     else 
        //         score+= Integer.parseInt(operations[i]);
        // }
        //         int n=operations.length;
        // int score=0;
        // ArrayList<Integer> op= new ArrayList<Integer>();
        // for(int i=0; i<n; i++)
        // {
        //     if(operations[i].equals("+") && op.size()>=2)
        //         op.add(op.get(i-1)+op.get(i-2));
        //     else if (operations[i].equals("D") && !op.isEmpty()) {
        //             op.add(2 * op.get(op.size() - 1));
        //         else if(operations[i].equals("C") && op.size()>=1)
        //                 op.remove(operations[i-1]);
        //             else 
        //                 op.add(Integer.parseInt(operations[i]));
        // }
        //Approach: Stack
        //TC:(n)| SC:(n)
        int n=operations.length;
        Stack<Integer> ScoreList= new Stack<>();
        int score=0;
        for(String sc: operations)
        {
            if(sc.equals("+") && ScoreList.size()>=2)
                ScoreList.push(ScoreList.peek()+ScoreList.elementAt(ScoreList.size()-2));
            else if(sc.equals("D") && !ScoreList.isEmpty())
                ScoreList.push(2*ScoreList.peek());
                else if(sc.equals("C") && !ScoreList.isEmpty())
                        ScoreList.pop();
                    else
                        ScoreList.push(Integer.parseInt(sc));
        }
        while(!ScoreList.isEmpty())
        {
            score+=ScoreList.pop();
        }
        return score;
    }
}