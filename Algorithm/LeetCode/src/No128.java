public class No128 {
        public static int longestConsecutive(int[] nums) {
            boolean[] isCalculated=new boolean[nums.length];
            int max=0;
            int ans=0;
            for(int i=0;i<nums.length;i++){
                boolean flag=true;
                boolean havePrevious=false;
                for(int k=0;k<nums.length;k++){
                    if(nums[k]==nums[i]-1){
                        havePrevious=true;
                        break;
                    }
                }
                if(!isCalculated[i]&&!havePrevious){
                    isCalculated[i]=true;
                    int tempi=i;
                    while(flag){
                        for(int j=0;j<nums.length;j++){
                            if(nums[j]==nums[tempi]+1){
                                max++;
                                isCalculated[j]=true;
                                tempi=j;
                                break;
                            }
                            //如果未找到下一个连续的值，则
                            if(j==nums.length-1){
                                flag=false;
                            }
                        }
                    }
                }
                if(ans<max)ans=max;
                max=0;
            }
            return ans+1;
        }

}
