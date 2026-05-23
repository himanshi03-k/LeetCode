int minZeroArray(
	const int * const nums,
	const int numsLen,

	int * const * const queries,
	const int queriesLen,
	const int * const queryLens
){
	(void)queryLens;

	int usedQueryCnt = 0;

	int diffs[numsLen + 1];
	memset(&diffs, 0, sizeof (diffs));
	int curVal = 0;
	for (int i = 0; i < numsLen; i += 1){
		curVal += diffs[i];
		if (curVal >= nums[i]){
			continue;
		}

		for (
			;
			curVal < nums[i] && usedQueryCnt < queriesLen;
			usedQueryCnt += 1
		){
			const int left = queries[usedQueryCnt][0],
				right = queries[usedQueryCnt][1],
				val = queries[usedQueryCnt][2];
			if (right < i){
				continue;
			}

			if (left <= i){
				curVal += val;
			}else {
				diffs[left] += val;
			}
			diffs[right + 1] -= val;
		}
		if (curVal < nums[i]){
			return -1;
		}
	}

	return usedQueryCnt;
}