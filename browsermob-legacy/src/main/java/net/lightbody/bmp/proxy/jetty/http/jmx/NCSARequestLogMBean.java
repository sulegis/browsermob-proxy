// ========================================================================
// $Id: NCSARequestLogMBean.java,v 1.7 2005/03/08 11:59:56 gregwilkins Exp $
// Copyright 1999-2004 Mort Bay Consulting Pty. Ltd.
// ------------------------------------------------------------------------
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at 
// http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// ========================================================================

package net.lightbody.bmp.proxy.jetty.http.jmx;

import net.lightbody.bmp.proxy.jetty.util.jmx.LifeCycleMBean;

import javax.management.MBeanException;

/* ------------------------------------------------------------ */
/** 
 *
 * @version $Revision: 1.7 $
 * @author Greg Wilkins (gregw)
 */
public class NCSARequestLogMBean extends LifeCycleMBean
{
    /* ------------------------------------------------------------ */
    /** Constructor. 
     * @exception MBeanException
     */
    public NCSARequestLogMBean()
        throws MBeanException
    {}    

    /* ------------------------------------------------------------ */
    protected void defineManagedResource()
    {
        super.defineManagedResource();
        defineAttribute("filename");
        defineAttribute("datedFilename");
        defineAttribute("logDateFormat");
        defineAttribute("logTimeZone");
        defineAttribute("retainDays");
        defineAttribute("extended");
        defineAttribute("logCookies");
        defineAttribute("logLatency");
        defineAttribute("append");
    }
}
