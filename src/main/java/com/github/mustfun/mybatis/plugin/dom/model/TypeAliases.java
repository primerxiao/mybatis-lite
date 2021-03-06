package com.github.mustfun.mybatis.plugin.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.SubTagList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 * @author yanglin
 */
public interface TypeAliases extends DomElement {

    @NotNull
    @SubTagList("typeAlias")
    public List<TypeAlias> getTypeAlias();

    @NotNull
    @SubTagList("package")
    public List<Package> getPackages();

}
