<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h1>Student Information</h1>
                <table border="1" bgcolor="blue">
                    <tr>
                        <th>STUDENT NAME</th>
                        <th>STUDENT PIN NUMBER</th>
                        <th>CGPA</th>
                    </tr>
                    <xsl:for-each select="student-info/student">
                        <tr>
                            <td><xsl:value-of select="sname"/></td>
                            <td><xsl:value-of select="spin"/></td>
                            <td><xsl:value-of select="cgpa"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
