class Solution {
    public int getMaxLen(int[] nums) {
      int pos = 0 , neg = 0 , res = 0;
      for(int i = 0 ; i < nums.length ; i++ ){
          if(nums[i] == 0) pos = neg = 0;
          else if (nums[i] > 0){
              pos += 1 ;

              if ( neg != 0 ) neg += 1; 

              res = Math.max(pos,res);
          }
          else {
              pos = pos + neg ;
              neg = pos - neg ;
              pos = pos - neg ;

              neg += 1 ;

              if( pos != 0 ){
                  pos += 1;
              }

              res = Math.max( res , pos);
          }
      }
      return res ;  
    }
}