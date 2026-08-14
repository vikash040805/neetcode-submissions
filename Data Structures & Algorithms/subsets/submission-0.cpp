class Solution {
public:
    void getAllSubsets(vector<int>& nums, vector<int>& ans,int i, vector<vector<int>>& allSub){
        if(i==nums.size()){
            allSub.push_back({ans});
            return;
        }
        ans.push_back(nums[i]);
        getAllSubsets(nums, ans, i+1, allSub);
        ans.pop_back();
        getAllSubsets(nums, ans, i+1, allSub);
    }
    
    vector<vector<int>> subsets(vector<int>& nums) {
       vector<vector<int>> allSub;
       vector<int> ans;

       getAllSubsets(nums,ans,0,allSub);
       return allSub; 
    }
};
