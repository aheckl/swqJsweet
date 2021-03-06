package def.dom;
public class HTMLMetaElement extends HTMLElement {
    /**
      * Sets or retrieves the character set used to encode the object.
      */
    public String charset;
    /**
      * Gets or sets meta-information to associate with httpEquiv or name.
      */
    public String content;
    /**
      * Gets or sets information used to bind the value of a content attribute of a meta element to an HTTP response header.
      */
    public String httpEquiv;
    /**
      * Sets or retrieves the value specified in the content attribute of the meta object.
      */
    public String name;
    /**
      * Sets or retrieves a scheme to be used in interpreting the value of a property specified for the object.
      */
    public String scheme;
    /**
      * Sets or retrieves the URL property that will be loaded after the specified time has elapsed. 
      */
    public String url;
    public static HTMLMetaElement prototype;
    public HTMLMetaElement(){}
}

