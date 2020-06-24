/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.base.model;

import java.util.List;

/**
 * @author zhenlong
 * @version $Id: MultiNode.java, v 0.1 2020年06月01日 11:53 PM zhenlong Exp $
 */
public class MultiNode {
    public int             val;
    public List<MultiNode> children;

    public MultiNode() {}

    public MultiNode(int _val) {
        val = _val;
    }

    public MultiNode(int _val, List<MultiNode> _children) {
        val = _val;
        children = _children;
    }

}