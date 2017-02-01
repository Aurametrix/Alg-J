 bool containsCycle(node_t *root)
    {
        node_t *p = root;
        bool ret = false;
        if (!root) return false; // Empty list

        while (p->next && !ret)
        {
            if ((uintptr_t)p->next & 1)
            {
                ret = true;
                break;
            }
            node_t *q = p->next;
            p->next = (uintptr_t)p->next | 1;
            p = q;
        }
    
        // Reset all pointers
        p = root;
        while (p->next && ((uintptr_t)p->next & 1))
        {
            p->next = (uintptr_t)p->next & ~1;
            p = p->next;
        }
        return ret;
    }
