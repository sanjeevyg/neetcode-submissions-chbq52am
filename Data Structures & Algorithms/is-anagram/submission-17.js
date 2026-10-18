class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
       const freq = new Map();

       for(const c of s) {
        // console.log(c);
            freq.set(c, (freq.get(c) ?? 0) + 1);
       }

    //    console.log(freq);

       for(const c of t) {
            freq.set(c, (freq.get(c) ?? 0) - 1);
       }

    //    console.log(freq);
       

       for(const[key, val] of freq) {
            if(val != 0) return false;
       }
       return true;
    }
}
