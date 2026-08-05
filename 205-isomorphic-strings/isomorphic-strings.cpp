class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size() != t.size()) return false;
        unordered_map <char, char> st;
        unordered_map <char, char> ts;
        for(int i = 0; i <s.size(); i++){
            char cs = s[i];
            char ct = t[i];
            // if(st.find(cs) == st.end()) st[cs] = ct;
            // else if(st[cs] != ct) return false;

            // if(ts.find(ct) == ts.end()) ts[ct] = cs;
            // else if(ts[ct] != cs) return false;

            if(st.count(cs) && st[cs] != ct) return false;
            if(ts.count(ct) && ts[ct] != cs) return false;

            st[cs] = ct;
            ts[ct] = cs;
        }
        return true;
    }
};