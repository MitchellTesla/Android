Regardless of the type of resource, all Android resources are identified by their IDs in Java source code.

The syntax for ID in the XML file is called resource-reference syntax.

Syntax
This resource reference has the following formal structure:

@[package:]type/name
The type corresponds to one of the resource-type namespaces available in R.java.

Map between R.java and resource type
The following R static fields

R.drawable
R.id
R.layout
R.string
R.attr
R.plural
R.array
are corresponding the following types in XML resource-reference syntax.

drawable
id
layout
string
attr
plurals
string-array



 

Resource Reference name and package
The name part in the resource reference @[package:]type/name is the name given to the resource.

Example
For example, text1 in the following layout file, it also gets represented as an int constant in R.java.

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    >
<TextView
    android:id="@+id/text1"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:text="@string/hello"
    />
 <Button
    android:id="@+id/b1"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:text="@string/hello"
   />
</LinearLayout>



 

Note
If you don't specify any package in the syntax @[package:]type/name, the pair type/name is resolved based on local resources and the application's local R.java package.

If you specify android:type/name, the reference is resolved using the package android and specifically through the android.R.java file.

You can use any Java package name in place of the package placeholder to locate the correct R.java file to resolve the reference.
