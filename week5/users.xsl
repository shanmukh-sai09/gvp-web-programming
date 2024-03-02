<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Users Details</title>
            </head>
            <body>
                <h2>Users Details</h2>
                <table border="1">
                    <tr>
                        <th>ID</th>
                        <th>Username</th>
                        <th>Email</th>
                        <th>DOB</th>
                        <th>Mobile</th>
                        <th>Gender</th>
                    </tr>
                    <xsl:for-each select="users/user">
                        <tr>
                            <td><xsl:value-of select="@id"/></td>
                            <td><xsl:value-of select="username"/></td>
                            <td><xsl:value-of select="email"/></td>
                            <td><xsl:value-of select="dob"/></td>
                            <td><xsl:value-of select="mobile"/></td>
                            <td><xsl:value-of select="gender"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
