class Solution {
public:
    int minTimeToReach(vector<vector<int>>& moveTime) {
        
        priority_queue<pair<int,pair<int,int>>,vector<pair<int,pair<int,int>>>,greater<>>pq;

        int n=moveTime.size();
        int m=moveTime[0].size();
        pq.push({0,{0,0}});
        vector<vector<int>>dir={{0,1},{0,-1},{1,0},{-1,0}};
        vector<vector<int>>cost(n,vector<int>(m,INT_MAX));
        cost[0][0]=moveTime[0][0];
        while(!pq.empty())
        {
            int costing=pq.top().first;
            int row=pq.top().second.first;
            int col=pq.top().second.second;
            pq.pop();
            for(int i=0;i<4;i++)
            {
                int r=row+dir[i][0];
                int c=col+dir[i][1];
                if(r>=0 && c>=0&& r<n && c<m)
                {
                 if(costing<=moveTime[r][c]&&cost[r][c]>1+moveTime[r][c])
                 {
                    int co=1+moveTime[r][c];
                    cost[r][c]=co;
                    pq.push({co,{r,c}});
                 }
                 else if(costing>moveTime[r][c] &&cost[r][c]>1+costing)
                 {
                    int co=costing+1;
                    cost[r][c]=co;
                    pq.push({co,{r,c}});
                 }

                }
            }

        }
        return cost[n-1][m-1];

    }
};